/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author Usuario iTC
 */
public class DominioGobierno implements Dominio{

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = "gob.ec";
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}
