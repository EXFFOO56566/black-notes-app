.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetOneByOne;
.super Landroid/appwidget/AppWidgetProvider;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 16

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetOneByOne;

    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v2

    new-instance v3, Lc/a/a/a/a/b/b/d;

    invoke-direct {v3, v0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    new-instance v4, Lc/a/a/a/a/b/b/b;

    invoke-direct {v4, v0}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    const-string v6, "widgetNoteId"

    invoke-virtual {v0, v6, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "widgetColor"

    invoke-virtual {v0, v7, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const/4 v8, 0x0

    :goto_0
    array-length v9, v2

    if-ge v8, v9, :cond_5

    aget v9, v2, v8

    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v3, v9}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v10

    if-nez v10, :cond_0

    goto/16 :goto_3

    :cond_0
    aget v11, v2, v8

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "green"

    invoke-interface {v7, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Landroid/widget/RemoteViews;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    const v14, 0x7f0b005c

    invoke-direct {v12, v13, v14}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    invoke-static {v11}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const v13, 0x7f080120

    const-string v14, "setBackgroundColor"

    invoke-virtual {v12, v13, v14, v11}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->j()Z

    move-result v11

    const v14, 0x7f0800d6

    const v15, 0x7f0801a3

    if-eqz v11, :cond_1

    new-instance v11, Landroid/content/Intent;

    const-class v13, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;

    invoke-direct {v11, v0, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_4

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " ("

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Lc/a/a/a/a/b/b/b;->a(I)I

    move-result v10

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ")"

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v15, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_2

    :cond_1
    new-instance v11, Landroid/content/Intent;

    const-class v13, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-direct {v11, v0, v13}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_3

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v13

    const-string v5, ""

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    invoke-virtual {v10}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-virtual {v12, v15, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :cond_3
    const/16 v5, 0x8

    :cond_4
    :goto_2
    invoke-virtual {v12, v14, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    const-string v5, "noteId"

    invoke-virtual {v11, v5, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    aget v5, v2, v8

    const-string v9, "widgetId"

    invoke-virtual {v11, v9, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 v5, 0x0

    invoke-static {v0, v5, v11, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v9

    const v10, 0x7f080120

    invoke-virtual {v12, v10, v9}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    aget v9, v2, v8

    invoke-virtual {v1, v9, v12}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public onDeleted(Landroid/content/Context;[I)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onDeleted(Landroid/content/Context;[I)V

    const/4 v0, 0x0

    const-string v1, "widgetNoteId"

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "widgetColor"

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    :goto_0
    array-length v2, p2

    if-ge v0, v2, :cond_0

    aget v2, p2, v0

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    aget v2, p2, v0

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetOneByOne;->a(Landroid/content/Context;)V

    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetOneByOne;->a(Landroid/content/Context;)V

    return-void
.end method
