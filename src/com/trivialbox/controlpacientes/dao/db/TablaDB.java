package com.trivialbox.controlpacientes.dao.db;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Resultado de una consulta.
 */
public class TablaDB implements Iterable<RowDB>{
    private final ArrayList<String> header;
    private final ArrayList<RowDB> rows;

    public TablaDB(ArrayList<String> header) {
        this.header = header;
        this.rows = new ArrayList<>();
    }
    
    public void addRow(RowDB row) {
        rows.add(row);
    }
    
    public RowDB getRow(int index) {
        return rows.get(index);
    }
    
    public ArrayList<String> getHeaders() {
        return header;
    }

    public ArrayList<RowDB> getRows() {
        return rows;
    }
    
    public boolean isEmpty() {
        return rows.isEmpty();
    }

    @Override
    public Iterator<RowDB> iterator() {
        Iterator<RowDB> it = new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < rows.size();
            }

            @Override
            public RowDB next() {
                return rows.get(index++);
            }
        };
        
        return it;
    }
    
}
