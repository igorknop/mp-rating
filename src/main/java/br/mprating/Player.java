package br.mprating;

/**
 *
 * @author igor
 */
public class Player {

    private String name = "Unnamed player";
    private Integer rating = 1500;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public void winFrom(Player player2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
