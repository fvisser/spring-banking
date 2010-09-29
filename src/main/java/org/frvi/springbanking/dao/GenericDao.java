package org.frvi.springbanking.dao;

import java.io.Serializable;

/**
 * 2010 Xebia B.V
 * User: frank
 * Created: Sep 21, 2010
 * Time: 10:18:53 PM
 */
public interface GenericDao <T, PK extends Serializable> {
    /** Persist the newInstance object into database */
     PK persist(T newInstance);

     /** Retrieve an object that was previously persisted to the database using
      *   the indicated id as primary key
      */
     T findById(PK id);

     /** Save changes made to a persistent object.  */
     void update(T transientObject);

     /** Remove an object from persistent storage in the database */
     void delete(T persistentObject);

}
