.class public La/m/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/m/o$a;
    }
.end annotation


# static fields
.field private static a:La/m/m;

.field private static b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/ref/WeakReference<",
            "La/e/a<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "La/m/m;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/m/b;

    invoke-direct {v0}, La/m/b;-><init>()V

    sput-object v0, La/m/o;->a:La/m/m;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, La/m/o;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, La/m/o;->c:Ljava/util/ArrayList;

    return-void
.end method

.method static a()La/e/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/e/a<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "La/m/m;",
            ">;>;"
        }
    .end annotation

    sget-object v0, La/m/o;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, La/e/a;

    invoke-direct {v0}, La/e/a;-><init>()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v2, La/m/o;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Landroid/view/ViewGroup;La/m/m;)V
    .locals 1

    sget-object v0, La/m/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, La/g/l/u;->C(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, La/m/o;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    sget-object p1, La/m/o;->a:La/m/m;

    :cond_0
    invoke-virtual {p1}, La/m/m;->clone()La/m/m;

    move-result-object p1

    invoke-static {p0, p1}, La/m/o;->c(Landroid/view/ViewGroup;La/m/m;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/m/l;->a(Landroid/view/ViewGroup;La/m/l;)V

    invoke-static {p0, p1}, La/m/o;->b(Landroid/view/ViewGroup;La/m/m;)V

    :cond_1
    return-void
.end method

.method private static b(Landroid/view/ViewGroup;La/m/m;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, La/m/o$a;

    invoke-direct {v0, p1, p0}, La/m/o$a;-><init>(La/m/m;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method

.method private static c(Landroid/view/ViewGroup;La/m/m;)V
    .locals 2

    invoke-static {}, La/m/o;->a()La/e/a;

    move-result-object v0

    invoke-virtual {v0, p0}, La/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/m/m;

    invoke-virtual {v1, p0}, La/m/m;->c(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, La/m/m;->a(Landroid/view/ViewGroup;Z)V

    :cond_1
    invoke-static {p0}, La/m/l;->a(Landroid/view/ViewGroup;)La/m/l;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, La/m/l;->a()V

    :cond_2
    return-void
.end method
