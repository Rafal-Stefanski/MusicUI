package sample.model;

public class Album {
    private int id;
    private String name;
    private int artistsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtistsId() {
        return artistsId;
    }

    public void setArtistsId(int artistsId) {
        this.artistsId = artistsId;
    }
}
