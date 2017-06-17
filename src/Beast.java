/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class Beast implements Comparable{
    private String name;
    private int id;
    private double xp;
    private int level;
    
    public Beast(String name,int id,double xp,int level) 
    {
    this.name = name.trim();
    this.id = id;
    this.xp = xp;
    this.level = level;
    }
    
    public String getName()
    {
    return this.name;
    }
    
    public int getID()
    {
    return this.id;
    }
    
    public double getXP()
    {
    return this.xp;
    }
    
    public int getLevel()
    {
    return this.level;
    }
    
    @Override
    public boolean equals(Object aBeast)
    {   
        if (aBeast == null) return false;
        if (aBeast == this) return true;
        if (!(aBeast instanceof Beast))return false;
        
        Beast argBeast = (Beast) aBeast;
        if (argBeast.getName().equals(this.getName()) && argBeast.getXP() == this.getXP())
        {
        System.out.println("Copy Cat!");
        return true;
        }
        return false;
    }
    
    @Override
    public int compareTo(Object aBeast)
    {
    Beast argBeast = (Beast) aBeast;
    return this.getName().compareTo(argBeast.name);
    }
    
    @Override
    public int hashCode()
    {
    return (int) (this.name.hashCode() + this.xp);
    }
    
    @Override
    public String toString()
    {
    return this.name;
    }
}
