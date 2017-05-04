package com.renan.game.sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by renan on 04/05/17.
 */

public class Bricks extends InteractiveTileObject {
    public Bricks(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
    }
}
