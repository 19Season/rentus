package com.rentus.services;

import com.rentus.repository.AdminRepository;
import com.rentus.utility.RepoFactory;
import com.rentus.models.Admin;

public class AdminManagementService implements AdminService {
    private AdminRepository AdminRepo;

    public AdminManagementService() {
        this.AdminRepo = RepoFactory.getAdminRepo();
    }

    @Override
    public Boolean login(Admin admin) {
        AdminRepo.login(admin);
        return true;
    }

    @Override
    public void register(Admin admin) {
        {
            AdminRepo.register(admin);
        }
    }
}
