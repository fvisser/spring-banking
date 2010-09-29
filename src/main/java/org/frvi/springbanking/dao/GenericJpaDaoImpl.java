package org.frvi.springbanking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * 2010 Xebia B.V
 * User: frank
 * Created: Sep 26, 2010
 * Time: 7:17:26 PM
 */
public abstract class GenericJpaDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {
    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

}
