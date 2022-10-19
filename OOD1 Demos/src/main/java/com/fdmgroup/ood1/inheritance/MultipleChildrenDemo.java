/**
 * MultipleChildrenDemo.java
 * - demonstrating how a parent can have multiple children
 * - but an object can ONLY inherit from one parent
 *
 * @author	S. Aziz
 * @version	0.0.1
 * @since	19/10/22
 */

package com.fdmgroup.ood1.inheritance;



class FDM {
}


class Trainer extends FDM {
}


class Trainee extends FDM {
}


class Administrator extends FDM {
}



// But the multiple parents can NOT be extended, ERR!!!!!!!!!!!!

class Person {
}


//class SalesPerson extends FDM, Person {
//
//}




