package factorymethoddesignpattern.newfeature

import factorymethoddesignpattern.Enemy

/**
 * if clint request to add new feature with existing feature
 */
class Vampire :Enemy {
    override fun attack() {
        println("Vampire attack!")
    }
}