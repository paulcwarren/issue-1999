package com.example.issue_1999;

import org.springframework.content.mongo.store.MongoContentStore;

public interface SampleContentStore extends MongoContentStore<Sample , String> {}

