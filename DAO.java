package com.example.delmo.apppedrofull;

import java.util.List;

/**
 * Created by delmo on 31/05/2017.
 */
    public interface DAO<T> {

        public boolean salvar(T t);
        public List<T> listar();
        public boolean deletar(int id);
        public boolean atualizar(T t);
    }


