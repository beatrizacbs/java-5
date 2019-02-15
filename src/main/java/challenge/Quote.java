package challenge;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	@Column(name="detail")
	private String quote;
	private LocalDate record_date;
	private String series;
	private LocalDate transmission_date;

	public Quote(){

	}

	public Quote(Integer id, Integer episode, String episode_name, String segment, String type, String actor,
			String character, String quote, LocalDate record_date, String series, LocalDate transmission_date) {
		this.id = id;
		this.episode = episode;
		this.episode_name = episode_name;
		this.segment = segment;
		this.type = type;
		this.actor = actor;
		this.character = character;
		this.setQuote(quote);
		this.record_date = record_date;
		this.series = series;
		this.transmission_date = transmission_date;
	}

	public String getActor() {
		return this.actor;
	}

	public String getCharacter() {
		return this.character;
	}

	public Integer getEpisode() {
		return this.episode;
	}

	public String getEpisode_name() {
		return this.episode_name;
	}

	public Integer getId() {
		return this.id;
	}

	public String getQuote() {
		return this.quote;
	}

	public LocalDate getRecord_date() {
		return this.record_date;
	}

	public String getSegment() {
		return this.segment;
	}

	public String getSeries() {
		return this.series;
	}

	public LocalDate getTransmission_date() {
		return this.transmission_date;
	}

	public String getType() {
		return this.type;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public void setEpisode_name(String episode_name) {
		this.episode_name = episode_name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public void setRecord_date(LocalDate record_date) {
		this.record_date = record_date;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setTransmission_date(LocalDate transmission_date) {
		this.transmission_date = transmission_date;
	}

	public void setType(String type) {
		this.type = type;
	}
}
