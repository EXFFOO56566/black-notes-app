.class public final Lcom/google/android/gms/internal/ads/bu1;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/bu1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/bu1;",
        "Lcom/google/android/gms/internal/ads/bu1$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/bu1;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzhnf:Lcom/google/android/gms/internal/ads/bu1;


# instance fields
.field private zzhnc:I

.field private zzhnd:I

.field private zzhne:Lcom/google/android/gms/internal/ads/dy1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/bu1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bu1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    const-class v1, Lcom/google/android/gms/internal/ads/bu1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/dy1;->c:Lcom/google/android/gms/internal/ads/dy1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bu1;->zzhne:Lcom/google/android/gms/internal/ads/dy1;

    return-void
.end method

.method public static s()Lcom/google/android/gms/internal/ads/bu1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    return-object v0
.end method

.method static synthetic t()Lcom/google/android/gms/internal/ads/bu1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/cu1;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/bu1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/bu1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/bu1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/bu1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzhnc"

    aput-object v0, p1, p2

    const-string p2, "zzhnd"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzhne"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/bu1;->zzhnf:Lcom/google/android/gms/internal/ads/bu1;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u000b\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/bu1$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/bu1$a;-><init>(Lcom/google/android/gms/internal/ads/cu1;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/bu1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/bu1;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Lcom/google/android/gms/internal/ads/eu1;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bu1;->zzhnc:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eu1;->a(I)Lcom/google/android/gms/internal/ads/eu1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/eu1;->h:Lcom/google/android/gms/internal/ads/eu1;

    :cond_0
    return-object v0
.end method

.method public final q()Lcom/google/android/gms/internal/ads/gu1;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bu1;->zzhnd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gu1;->a(I)Lcom/google/android/gms/internal/ads/gu1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/gu1;->h:Lcom/google/android/gms/internal/ads/gu1;

    :cond_0
    return-object v0
.end method

.method public final r()Lcom/google/android/gms/internal/ads/dy1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu1;->zzhne:Lcom/google/android/gms/internal/ads/dy1;

    return-object v0
.end method
