.class public final Lcom/google/android/gms/internal/ads/yu1$a;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/yu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/yu1$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/yu1$a;",
        "Lcom/google/android/gms/internal/ads/yu1$a$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/yu1$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;


# instance fields
.field private zzhoq:I

.field private zzhpa:Lcom/google/android/gms/internal/ads/ou1;

.field private zzhpb:I

.field private zzhpc:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/yu1$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/yu1$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;

    const-class v1, Lcom/google/android/gms/internal/ads/yu1$a;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    return-void
.end method

.method static synthetic u()Lcom/google/android/gms/internal/ads/yu1$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/xu1;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/yu1$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/yu1$a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/yu1$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/yu1$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzhpa"

    aput-object v0, p1, p2

    const-string p2, "zzhpb"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzhpc"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzhoq"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpd:Lcom/google/android/gms/internal/ads/yu1$a;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/yu1$a$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/yu1$a$a;-><init>(Lcom/google/android/gms/internal/ads/xu1;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/yu1$a;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/yu1$a;-><init>()V

    return-object p1

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

.method public final p()Lcom/google/android/gms/internal/ads/su1;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpb:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/su1;->a(I)Lcom/google/android/gms/internal/ads/su1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/su1;->g:Lcom/google/android/gms/internal/ads/su1;

    :cond_0
    return-object v0
.end method

.method public final q()Lcom/google/android/gms/internal/ads/lv1;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhoq:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lv1;->a(I)Lcom/google/android/gms/internal/ads/lv1;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/lv1;->h:Lcom/google/android/gms/internal/ads/lv1;

    :cond_0
    return-object v0
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpa:Lcom/google/android/gms/internal/ads/ou1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final s()Lcom/google/android/gms/internal/ads/ou1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpa:Lcom/google/android/gms/internal/ads/ou1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ou1;->t()Lcom/google/android/gms/internal/ads/ou1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/yu1$a;->zzhpc:I

    return v0
.end method
