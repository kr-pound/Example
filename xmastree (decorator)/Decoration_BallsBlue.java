/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmastree;

/**
 *
 * @author krita
 */
public class Decoration_BallsBlue extends TreeDecorator {

    public Decoration_BallsBlue(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", Balls Blue";
    }

    @Override
    public double cost() {
        return tree.cost() + 2;
    }
    
}
