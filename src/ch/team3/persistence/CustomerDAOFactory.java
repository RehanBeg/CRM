package ch.team3.persistence;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOFactory {

    public static CustomerDAOIf getDAO(){
        return CustomerDAO.getInstance();
    }
}