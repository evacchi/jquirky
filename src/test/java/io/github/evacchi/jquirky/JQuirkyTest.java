package io.github.evacchi.jquirky;
import org.junit.jupiter.api.Test;
import java.util.function.*;
import static io.github.evacchi.jquirky.JQuirky.*;
import static org.junit.jupiter.api.Assertions.*;

public class JQuirkyTest {
    
    void assertType(Class<?> type, Object f) {
        assertTrue(type.isInstance(f), "Expected " + type.getCanonicalName() + ", got: " + f);
    }
    
    @Test
    void checkTypes() {
        {
            var f = $((Object x, Object y) -> {});
            assertType(BiConsumer.class, f);
        }
        {
            var f = $((Float x, Integer y) -> x);
            assertType(BiFunction.class, f);
        }
        {
            var f = $((Object x, String y) -> true);
            assertType(BiPredicate.class, f);
        }
        {
            var f = $((Object x, Object y) -> x);
            assertType(BinaryOperator.class, f);
        }
        {
            var f = $(() -> true);
            assertType(BooleanSupplier.class, f);
        }
        {
            var f = $((Object x) -> {});
            assertType(Consumer.class, f);
        }
        {
            var f = $((double x, double y) -> x);
            assertType(DoubleBinaryOperator.class, f);
        }
        {
            var f = $((double x) -> {});
            assertType(DoubleConsumer.class, f);
        }
        {
            var f = $((double x) -> "");
            assertType(DoubleFunction.class, f);
        }
        {
            var f = $((double x) -> true);
            assertType(DoublePredicate.class, f);
        }
        {
            var f = $(() -> 1d);
            assertType(DoubleSupplier.class, f);
        }
        {
            var f = $((double d) -> 1);
            assertType(DoubleToIntFunction.class, f);
        }
        {
            var f = $((double d) -> 1L);
            assertType(DoubleToLongFunction.class, f);
        }
        {
            var f = $((double d) -> d);
            assertType(DoubleUnaryOperator.class, f);
        }
        {
            var f = $((String o) -> new Object());
            assertType(Function.class, f);
        }
        {
            var f = $((int x, int y) -> x);
            assertType(IntBinaryOperator.class, f);
        }
        {
            var f = $((int x) -> {});
            assertType(IntConsumer.class, f);
        }
        {
            var f = $((int x) -> "");
            assertType(IntFunction.class, f);
        }
        {
            var f = $((int x) -> true);
            assertType(IntPredicate.class, f);
        }
        {
            var f = $(() -> 1);
            assertType(IntSupplier.class, f);
        }
        {
            var f = $((int x) -> 1d);
            assertType(IntToDoubleFunction.class, f);
        }
        {
            var f = $((int x) -> 1L);
            assertType(IntToLongFunction.class, f);
        }
        {
            var f = $((int x) -> x);
            assertType(IntUnaryOperator.class, f);
        }
        {
            var f = $((long x, long y) -> x);
            assertType(LongBinaryOperator.class, f);
        }
        {
            var f = $((long x) -> {});
            assertType(LongConsumer.class, f);
        }
        {
            var f = $((long x) -> "");
            assertType(LongFunction.class, f);
        }
        {
            var f = $((long l) -> true);
            assertType(LongPredicate.class, f);
        }
        {
            var f = $(() -> 1L);
            assertType(LongSupplier.class, f);
        }
        {
            var f = $((long l) -> 1d);
            assertType(LongToDoubleFunction.class, f);
        }
        {
            var f = $((long l) -> 1);
            assertType(LongToIntFunction.class, f);
        }
        {
            var f = $((long l) -> l);
            assertType(LongUnaryOperator.class, f);
        }
        {
            var f = $((Object o, double d) -> {});
            assertType(ObjDoubleConsumer.class, f);
        }
        {
            var f = $((Object o, int i) -> {});
            assertType(ObjIntConsumer.class, f);
        }
        {
            var f = $((Object o, long l) -> {});
            assertType(ObjLongConsumer.class, f);
        }
        {
            var f = $((Object o) -> true);
            assertType(Predicate.class, f);
        }
        {
            var f = $(() -> new Object());
            assertType(Supplier.class, f);
        }
        {
            var f = $((Object x, String y) -> 1d);
            assertType(ToDoubleBiFunction.class, f);
        }
        {
            var f = $((Object o) -> 1d);
            assertType(ToDoubleFunction.class, f);
        }
        {
            var f = $((Object x, String y) -> 1);
            assertType(ToIntBiFunction.class, f);
        }
        {
            var f = $((Object o) -> 1);
            assertType(ToIntFunction.class, f);
        }
        {
            var f = $((Object x, String y) -> 1L);
            assertType(ToLongBiFunction.class, f);
        }
        {
            var f = $((Object o) -> 1L);
            assertType(ToLongFunction.class, f);
        }
        {
            var f = $((Object o) -> o);
            assertType(UnaryOperator.class, f);
        }
    }
}