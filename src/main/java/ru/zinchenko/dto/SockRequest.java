package ru.zinchenko.dto;

import lombok.Data;
import ru.zinchenko.model.Color;
import ru.zinchenko.model.Size;

@Data
public class SockRequest {
    private Color color;
    private Size size;
    private int cottonPart;
    private int quantity;
}