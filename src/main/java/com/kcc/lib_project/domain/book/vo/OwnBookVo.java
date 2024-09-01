package com.kcc.lib_project.domain.book.vo;

import com.kcc.lib_project.global.util.CallNumberGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnBookVo {

    private String callNumber;
    private LocalDate receiptAt;
    private String status;
    private Long isbn;

    public static OwnBookVo from(BookVo bookVo) {

        String callNumber = CallNumberGenerator.generateCallNumber();

        return new OwnBookVo(
                callNumber,
                LocalDate.now(),
                Status.AVAILABLE.toString(),
                bookVo.getIsbn()
        );
    }
}
