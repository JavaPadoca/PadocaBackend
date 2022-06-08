package controllers;

//import models.EmployeeModel;

public class EmployeeController {
    public void updateUser(int Id, String Name, String Password, String Email){
        try {
        //    [pmDB].db();
        //    [pmDB].stat.executeUpdate("update [tbEmployee] set"
        //            + " password='"+Password+"',"
        //            + " name='"+Name+"',"
        //            + " email='"+Email+"'"
        //            + " where employeeId='"+Id+"'");

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
