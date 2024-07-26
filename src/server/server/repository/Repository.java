package server.server.repository;

import java.util.List;

public interface Repository<T> {
    void save(T text);
    List<String> load();
}
