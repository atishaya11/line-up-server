package com.dscjss.lineup.util;

import com.dscjss.lineup.location.dto.LocationDto;
import com.dscjss.lineup.location.model.RecentLocation;
import com.dscjss.lineup.users.dto.UserBean;
import com.dscjss.lineup.users.model.User;

public class Mapper {


    public static UserBean getUserBean(User user) {
        if(user == null){
            return null;
        }

        UserBean userBean = new UserBean();
        userBean.setId(user.getId());
        userBean.setUsername(user.getUsername());
        return userBean;
    }

    public static LocationDto getRecentLocationDto(RecentLocation recentLocation) {
        if (recentLocation == null) {
            return null;
        }
        LocationDto locationDto = new LocationDto();
        locationDto.setUserBean(getUserBean(recentLocation.getUser()));
        locationDto.setLat(recentLocation.getLat());
        locationDto.setLng(recentLocation.getLng());
        locationDto.setLastUpdatedAt(recentLocation.getLastUpdatedAt());
        return locationDto;
    }
}