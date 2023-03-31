.class public Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;
.super Landroidx/appcompat/app/c;
.source ""


# instance fields
.field private s:Lnotepad/note/notas/notes/notizen/util/a;

.field private t:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

.field private u:I

.field private v:I

.field private w:Ljava/lang/String;

.field private x:Lc/a/a/a/a/b/b/d;

.field private y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

.field private z:Lc/a/a/a/a/b/b/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const-string v0, "purpleLight"

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->w:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->w:Ljava/lang/String;

    return-object p1
.end method

.method private o()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private p()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "appWidgetId"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    const-string v0, "#000000"

    invoke-static {p0, v0}, Lnotepad/note/notas/notes/notizen/util/c;->a(Landroidx/appcompat/app/c;Ljava/lang/String;)V

    new-instance v0, Lnotepad/note/notas/notes/notizen/util/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/util/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    new-instance v0, Lc/a/a/a/a/b/b/b;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->z:Lc/a/a/a/a/b/b/b;

    new-instance v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-direct {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;-><init>()V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->t:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    const v0, 0x7f080130

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->t:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    const v0, 0x7f080195

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    new-instance v0, Lc/a/a/a/a/b/b/d;

    invoke-direct {v0, p0}, Lc/a/a/a/a/b/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->x:Lc/a/a/a/a/b/b/d;

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->t:Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;

    new-instance v1, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity$a;

    invoke-direct {v1, p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;)V

    invoke-virtual {v0, v1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/a$a;)V

    return-void
.end method


# virtual methods
.method public btnClick(Landroid/view/View;)V
    .locals 10

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->s:Lnotepad/note/notas/notes/notizen/util/a;

    invoke-virtual {v0}, Lnotepad/note/notas/notes/notizen/util/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007e

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetSearchActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f010011

    invoke-virtual {p0, p1, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f080061

    if-ne p1, v0, :cond_9

    iget p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    const-string v0, "Select the note."

    if-nez p1, :cond_2

    :goto_0
    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_2
    const-string p1, "widgetNoteId"

    invoke-virtual {p0, p1, v3}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "widgetColor"

    invoke-virtual {p0, v1, v3}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    if-eqz v4, :cond_3

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    invoke-interface {p1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->w:Ljava/lang/String;

    invoke-interface {v1, p1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_3
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    new-instance v1, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f0b005c

    invoke-direct {v1, v4, v5}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->w:Ljava/lang/String;

    invoke-static {v4}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    const v5, 0x7f080120

    const-string v6, "setBackgroundColor"

    invoke-virtual {v1, v5, v6, v4}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->x:Lc/a/a/a/a/b/b/d;

    iget v6, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    invoke-virtual {v4, v6}, Lc/a/a/a/a/b/b/d;->d(I)Lc/a/a/a/a/b/c/d;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->x:Lc/a/a/a/a/b/b/d;

    iget v6, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    invoke-virtual {v0, v6}, Lc/a/a/a/a/b/b/d;->c(I)Z

    move-result v0

    const v6, 0x7f0800d6

    const v7, 0x7f0801a3

    if-eqz v0, :cond_6

    new-instance v0, Landroid/content/Intent;

    const-class v8, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetChecklistActivity;

    invoke-direct {v0, p0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->z:Lc/a/a/a/a/b/b/b;

    iget v9, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    invoke-virtual {v4, v9}, Lc/a/a/a/a/b/b/b;->a(I)I

    move-result v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v7, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v1, v6, v3}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_2

    :cond_6
    new-instance v0, Landroid/content/Intent;

    const-class v8, Lnotepad/note/notas/notes/notizen/widget/oneByOne/WidgetNoteActivity;

    invoke-direct {v0, p0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->f()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lc/a/a/a/a/b/c/d;->i()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v7, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :cond_8
    const/16 v4, 0x8

    invoke-virtual {v1, v6, v4}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    :goto_2
    iget v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    const-string v6, "noteId"

    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget v4, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    const-string v6, "widgetId"

    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-static {p0, v3, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    invoke-virtual {p1, v0, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iget v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->u:I

    const-string v1, "appWidgetId"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->o()V

    :cond_9
    :goto_3
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    const-string p2, "noteId"

    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->v:I

    iget-object p2, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->y:Lnotepad/note/notas/notes/notizen/ui/MyTextView;

    iget-object p3, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->x:Lc/a/a/a/a/b/b/d;

    invoke-virtual {p3, p1}, Lc/a/a/a/a/b/b/d;->e(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0042

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->p()V

    invoke-direct {p0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/setting/NoteSettingActivity;->q()V

    return-void
.end method
