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
public class VisitorPrintCd implements Visitor{

    @Override
    public void visite(CD cd) {
        System.out.println(cd.toString());
    }

    @Override
    public void visite(Book book) {}
    
}
