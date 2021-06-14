package net.killarexe.littlerage.engine.gameObject.components;

import net.killarexe.littlerage.engine.editor.PropertiesWindow;
import static net.killarexe.littlerage.engine.input.MouseListener.*;

import net.killarexe.littlerage.engine.input.MouseListener;
import net.killarexe.littlerage.engine.renderer.Sprite;

public class TranslateGizmo extends Gizmo{

    public TranslateGizmo(Sprite arrowSprite, PropertiesWindow propertiesWindow) {
        super(arrowSprite, propertiesWindow);
    }

    @Override
    public void update(float dt) {
        if (activeGameObject != null) {
            if (xAxisActive && !yAxisActive) {
                activeGameObject.transform.pos.x -= MouseListener.getWorldDx();
            } else if (yAxisActive) {
                activeGameObject.transform.pos.y -= MouseListener.getWorldDy();
            }
        }

        super.update(dt);
    }
}
