/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author JP
 */
public class UserBusinessImpl implements UserBusiness {

    @Override
    public Userlogin getUser() {
        Userlogin user = new Userlogin ("admin", "admin");
        return user;
    }
    
    
}
