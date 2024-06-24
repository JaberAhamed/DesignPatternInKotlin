package factorymethoddesignpattern.enemyfactory

import factorymethoddesignpattern.*
import factorymethoddesignpattern.newfeature.Vampire

object EnemyFactory {

    fun createEnemy(type: String): Enemy {
        if (type.isEmpty()) {
            // default return
            return Zombie()
        }
        when (type.uppercase()) {
            Constraints.ZOMBIE -> return Zombie()
            Constraints.ALIEN -> return Alien()
            Constraints.ROBOT -> return Robot()
            Constraints.VAMPIRE -> return Vampire()
            else -> {
                throw IllegalArgumentException("Invalid enemy type");

            }
        }
    }

}