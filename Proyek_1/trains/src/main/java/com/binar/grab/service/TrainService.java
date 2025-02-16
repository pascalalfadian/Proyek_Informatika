package com.binar.grab.service;

import com.binar.grab.model.Train;

import java.util.Map;

public interface TrainService {
    public Map insert(Train contoh);
    public Map update(Train train, Long id);
    public Map delete(Long id);
    public Map getAllSharingTracks();
    public Map getAllAmenitiesContaining(String keyword);
    public Map getAll();
}
