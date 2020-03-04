package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    static class Widget{
        List<WidgetItem> widgetItems;

        public Widget(final List<WidgetItem> widgetItems) {
            this.widgetItems = widgetItems;
        }
    }

    static class WidgetItem {
        int id;

        public WidgetItem(final int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(List.of(4,9,2),List.of(6,3,5));
        System.out.println(list.stream().flatMap(List::stream).collect(Collectors.toList()));

        List<Widget> widgetList = List.of(
            new Widget(List.of(new WidgetItem(5), new WidgetItem(2), new WidgetItem(7))),
            new Widget(List.of(new WidgetItem(34), new WidgetItem(22), new WidgetItem(73))),
            new Widget(List.of(new WidgetItem(54), new WidgetItem(98), new WidgetItem(12)))
        );

        final List<Integer> collect = widgetList.stream()
            .flatMap((Function<Widget, Stream<WidgetItem>>) widget -> widget.widgetItems.stream())
            .map(WidgetItem::getId)
            .collect(Collectors.toList());
        System.out.println(collect);
    }
}
