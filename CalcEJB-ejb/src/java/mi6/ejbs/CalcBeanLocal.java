/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mi6.ejbs;

import javax.ejb.Local;

/**
 *
 * @author AgtLucas
 */

@Local
public interface CalcBeanLocal {
 
    double sum(double a, double b);
    
}
