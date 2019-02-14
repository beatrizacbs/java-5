package challenge;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "scripts")
public class Quote {

	@Id
	private Integer id;

	private Integer episode;
	private String episode_name;
	private String segment;
	private String type;
	private String actor;
	private String character;
	private String detail;
	private LocalDate record_date;
	private String series;
	private LocalDate transmission_date;

	public Quote(Integer id, Integer episode, String episode_name, String segment, String type, String actor,
				 String character, String detail, LocalDate record_date, String series, LocalDate transmission_date) {
		this.id = id;
		this.episode = episode;
		this.episode_name = episode_name;
		this.segment = segment;
		this.type = type;
		this.actor = actor;
		this.character = character;
		this.detail = detail;
		this.record_date = record_date;
		this.series = series;
		this.transmission_date = transmission_date;
	}

	public Quote(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEpisode() {
		return episode;
	}

	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public String getEpisode_name() {
		return episode_name;
	}

	public void setEpisode_name(String episode_name) {
		this.episode_name = episode_name;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalDate getRecord_date() {
		return record_date;
	}

	public void setRecord_date(LocalDate record_date) {
		this.record_date = record_date;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public LocalDate getTransmission_date() {
		return transmission_date;
	}

	public void setTransmission_date(LocalDate transmission_date) {
		this.transmission_date = transmission_date;
	}
}
