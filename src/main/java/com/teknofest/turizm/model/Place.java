package com.teknofest.turizm.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String address; // kullanıcıya tam adres gösterilebilir
    @Column
    private String region; // mahalle, bölge adı, semt gibi
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column(name="is_approved")
    private Boolean isApproved; // default: false
    @Column
    private String type;
    @Column
    private String description;
    @Column(name="image_url")
    private String imageUrl;
    @Column
    private Float rating;
    @Column
    @ElementCollection
    private List<String> reviews;


    public Place() {}


    public Place(Long id, String name, String city, String address, String region, Double latitude, Double longitude, Boolean isApproved, String type, String description, Float rating, String imageUrl, List<String> reviews) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isApproved = isApproved;
        this.type = type;
        this.description = description;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.reviews = reviews;
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }
}