package factorymethoddesignpattern.othersuses

import factorymethoddesignpattern.Enemy
import factorymethoddesignpattern.enemyfactory.EnemyFactory

class HardLevel :GameLevel() {
    override fun createEnemies(): List<Enemy> {
        val enemies: ArrayList<Enemy> = ArrayList()

            enemies.add(EnemyFactory.createEnemy("ZOMBIE"))

            enemies.add(EnemyFactory.createEnemy("ALIEN"))

            enemies.add(   EnemyFactory.createEnemy("ROBOT"))

            enemies.add(  EnemyFactory.createEnemy("VAMPIRE"))

        return  enemies
    }
}