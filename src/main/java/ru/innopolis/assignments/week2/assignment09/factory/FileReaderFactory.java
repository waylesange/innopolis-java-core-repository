/*
 * Copyright (c) 2019. Alexander Tsupko (alexander.tsupko@outlook.com). All rights reserved.
 */

package ru.innopolis.assignments.week2.assignment09.factory;

import ru.innopolis.assignments.week2.assignment09.readers.FileReader;
import ru.innopolis.assignments.week2.assignment09.readers.SourceReader;

/**
 * Конкретный класс-наследник класса {@code SourceReaderFactory}, создающий читателя из файла.
 *
 * @author Александр Цупко
 */
public class FileReaderFactory extends SourceReaderFactory {
    /**
     * Возвращает читателя из файла.
     *
     * @return объект интерфейса {@code SourceReader}, имеющий метод для получения буферизованного читателя
     */
    @Override
    protected SourceReader createSourceReader() {
        return new FileReader();
    }
}
