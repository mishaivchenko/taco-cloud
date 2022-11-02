package com.example.tacocloud.tacos.data;

import com.example.tacocloud.tacos.TacoOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    /* Possible use states for repository
    IsAfter, After, IsGreaterThan, GreaterThan; IsGreaterThanEqual, GreaterThanEqual; IsBefore, Before, IsLessThan, LessThan; IsLessThanEqual, LessThanEqual; IsBetween, Between;
    IsNull, Null;
    IsNotNull, NotNull;
    IsIn, In;
    IsNotIn, NotIn;
    IsStartingWith, StartingWith, StartsWith; IsEndingWith, EndingWith, EndsWith; IsContaining, Containing, Contains; IsLike, Like;
    IsNotLike, NotLike; IsTrue, True;
    IsFalse, False;
    Is, Equals;
    IsNot, Not; IgnoringCase, IgnoresCase.*/
    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

    List<TacoOrder> readTacoOrdersByDeliveryCityEquals(String city);

    @Query("select o from TacoOrder o where o.deliveryCity = :deliveryCity")
    List<TacoOrder> readOrdersDeliveredInCity(@Param("deliveryCity") String deliveryCity);

}
