/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucla.cs.scai.canali.core.index.tokens;

/**
 *
 * @author Giuseppe M. Mazzeo <mazzeo@cs.ucla.edu>
 */
public class LiteralStringToken extends LiteralToken {

    String text;

    public LiteralStringToken(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

}
