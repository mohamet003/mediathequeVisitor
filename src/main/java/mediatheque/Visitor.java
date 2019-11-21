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
public interface Visitor {
    void visite(CD cd);
    void visite(Book book);

}
