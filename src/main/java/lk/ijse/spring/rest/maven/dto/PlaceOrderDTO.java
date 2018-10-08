package lk.ijse.spring.rest.maven.dto;

import java.util.List;

public class PlaceOrderDTO {
    private OrdersDTO ordersDTO;
    private List<OrderDetailsDTO> detailsDTOList;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(OrdersDTO ordersDTO, List<OrderDetailsDTO> detailsDTOList) {
        this.ordersDTO = ordersDTO;
        this.detailsDTOList = detailsDTOList;
    }

    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    public List<OrderDetailsDTO> getDetailsDTOList() {
        return detailsDTOList;
    }

    public void setDetailsDTOList(List<OrderDetailsDTO> detailsDTOList) {
        this.detailsDTOList = detailsDTOList;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "ordersDTO=" + ordersDTO +
                ", detailsDTOList=" + detailsDTOList +
                '}';
    }
}
