package com.renan.game.sprites;


import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileSet;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.renan.game.MarioBros;
import com.renan.game.scenes.Hud;

public class Coin extends InteractiveTileObject {
    private static TiledMapTileSet tileset;
    private static final int BLANK_COIN = 28;

    public Coin(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
        tileset = map.getTileSets().getTileSet("tileset_gutter");
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.COIN_BIT);
    }

    @Override
    public void onHeadHit() {
       /* TiledMapTile coin = getCell().getTile();
        if (coin != null && coin.getId() != BLANK_COIN) {
            getCell().setTile(tileset.getTile(BLANK_COIN));
            Hud.addScore(200);
        }*/
    }
}
