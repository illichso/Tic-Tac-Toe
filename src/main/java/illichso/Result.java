package illichso;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Result {
    X("X"),
    O("O"),
    D("Draw");

    private String value;

}
