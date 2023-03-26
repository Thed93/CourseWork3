package ru.zinchenko.services;

import ru.zinchenko.dto.SockRequest;
import ru.zinchenko.model.Color;
import ru.zinchenko.model.Size;

public interface SockService {

    void addSock(SockRequest sockRequest);

    void issueSock(SockRequest sockRequest);

    int getSockQuantity(Color color, Size size, Integer cottonPartMin, Integer cottonPartMax);

    void removeDefectSock(SockRequest sockRequest);
}