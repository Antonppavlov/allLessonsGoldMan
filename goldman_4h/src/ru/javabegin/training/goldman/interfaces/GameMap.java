package ru.javabegin.training.goldman.interfaces;

/**
 * интерфейс для игровой карты
 */
public interface GameMap {
    
    int getHeight();
    
    int getWidth();
    
    boolean loadMap(Object source);
    
    boolean saveMap(Object source);

    boolean drawMap();
    
    int getTimeLimit();
    
}
