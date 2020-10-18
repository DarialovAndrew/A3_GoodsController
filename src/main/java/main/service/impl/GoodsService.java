package main.service.impl;


import main.service.model.Apparatus;
import main.service.model.Locker;
import main.service.model.Shower;
import main.service.repository.ApparatusRepository;
import main.service.repository.LockerRepository;
import main.service.repository.ShowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public final class GoodsService {
    private final LockerRepository lockers;
    private final ShowerRepository showers;
    private final ApparatusRepository apparatuses;

    @Autowired
    public GoodsService(LockerRepository lockers, ShowerRepository showers, ApparatusRepository apparatuses) {
        this.lockers = lockers;
        this.showers = showers;
        this.apparatuses = apparatuses;
    }

    public void add(Locker thing) {
        lockers.save(thing);
    }

    public void add(Shower thing) {
        showers.save(thing);
    }

    public void add(Apparatus thing) {
        apparatuses.save(thing);
    }

    public void deleteLocker(UUID id) {
        lockers.deleteById(id);
    }

    public void deleteShower(UUID id) {
        showers.deleteById(id);
    }

    public void deleteApparatus(UUID id) {
        apparatuses.deleteById(id);
    }

    public LockerRepository getLockers() {
        return lockers;
    }

    public ShowerRepository getShowers() {
        return showers;
    }

    public ApparatusRepository getApparatuses() {
        return apparatuses;
    }

    public String toString() {
        return "Lockers: " + lockers.toString() + "\nShowers: " + this.showers.toString() + "\nApparatuses: " + this.apparatuses.toString() + "\n";
    }
}
