/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author mohametkone
 */
public class VisitorPrintBook implements Visitor {

    @Override
    public void visite(CD cd) {}

    @Override
    public void visite(Book book) {
        System.out.println(book.toString());
    }
    
}
