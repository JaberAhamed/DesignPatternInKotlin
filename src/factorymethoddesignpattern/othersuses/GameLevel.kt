package factorymethoddesignpattern.othersuses

import factorymethoddesignpattern.Enemy

/**
 * Extent the feature like enemy level attack in different game level
 */
abstract class GameLevel {

    abstract fun createEnemies(): List<Enemy>

    open fun start() {
        createEnemies().forEach { enemy ->
            enemy.attack()
        }
    }
}