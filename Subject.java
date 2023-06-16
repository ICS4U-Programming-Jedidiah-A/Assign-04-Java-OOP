/**
* This program is a school grading system.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-06-14
*/
class Subject {
    private int id;
    private String name;

    /**
    * This is the method returns an .
    *
    * @param id This is the student for the output
    * @param name This is the name output
    */
    Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
    * This is the method returns an .
    *
    * @return A string that will be outputted
    */
    public int getId() {
        return id;
    }

    /**
    * This is the method returns a name.
    *
    * @return A string that will be outputted
    */

    public String getName() {
        return name;
    }
}
