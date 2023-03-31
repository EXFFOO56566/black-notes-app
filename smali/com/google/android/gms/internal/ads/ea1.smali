.class public final Lcom/google/android/gms/internal/ads/ea1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/a60;
.implements Lcom/google/android/gms/internal/ads/q70;
.implements Lcom/google/android/gms/internal/ads/jb1;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/df1;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/ti2;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/wi2;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/ads/q70;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/ads/ea1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/df1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ea1;->b:Lcom/google/android/gms/internal/ads/df1;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ea1;)Lcom/google/android/gms/internal/ads/ea1;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ea1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ea1;->b:Lcom/google/android/gms/internal/ads/df1;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/ea1;-><init>(Lcom/google/android/gms/internal/ads/df1;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/ea1;->a(Lcom/google/android/gms/internal/ads/jb1;)V

    return-object v0
.end method


# virtual methods
.method public final M0()V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ea1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/ia1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a()V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ea1;->b:Lcom/google/android/gms/internal/ads/df1;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/df1;->a()V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ea1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/google/android/gms/internal/ads/ja1;->a:Lcom/google/android/gms/internal/ads/bb1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ea1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/ga1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ga1;-><init>(I)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/jb1;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ea1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/q70;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/si2;)V
    .locals 2

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ea1;->f:Lcom/google/android/gms/internal/ads/ea1;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ea1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/ha1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ha1;-><init>(Lcom/google/android/gms/internal/ads/si2;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cb1;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/ads/bb1;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ti2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/wi2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ea1;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
