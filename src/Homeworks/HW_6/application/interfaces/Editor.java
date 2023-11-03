package Homeworks.HW_6.application.interfaces;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {

    boolean add(T item);

    boolean edit(T item);

    boolean remove(T item);

    T getById(TId id);

    Collection<T> getAll();

}
