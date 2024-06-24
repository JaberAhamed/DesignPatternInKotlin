package factorymethoddesignpattern.othersuses

import factorymethoddesignpattern.Enemy
import factorymethoddesignpattern.enemyfactory.EnemyFactory

class EasyLevel :GameLevel() {
    override fun createEnemies(): List<Enemy> {

        val enemies: ArrayList<Enemy> = ArrayList()

            enemies.add( EnemyFactory.createEnemy("ZOMBIE"))

            enemies.add(EnemyFactory.createEnemy("ALIEN"))

        return enemies
    }


}