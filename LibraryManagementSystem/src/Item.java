
public abstract class Item {

	private int id;

	private String name;

	private String dateOfPublishing;

	private Location location;

	private Author author;

	private Genre genre;

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

	public String getDateOfPublishing() {
		return dateOfPublishing;
	}

	public void setDateOfPublishing(String dateOfPublishing) {
		this.dateOfPublishing = dateOfPublishing;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
