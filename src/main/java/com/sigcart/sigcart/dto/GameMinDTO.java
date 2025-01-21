package com.sigcart.sigcart.dto;

import com.sigcart.sigcart.entities.Games;

public class GameMinDTO {
		
		private long id;
		private String title;
		private Integer year;
		private String imgUrl;
		private String shortDescription;

		public GameMinDTO() {}

		public GameMinDTO(Games games) {
			this.id = games.getId();
			this.title = games.getTitle();
			this.year = games.getYear();
			this.imgUrl = games.getImgUrl();
			this.shortDescription = games.getShortDescription();
		}

		public long getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public Integer getYear() {
			return year;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}
		
		
		
	
	
}
